const csrfToken = $("#csrfToken").val();
const loginRoute = $("#loginRoute").val();
const validateRoute = $("#validateRoute").val();
const createUserRoute = $("#createUserRoute").val();
const addTaskRoute = $("#addTaskRoute").val();
const deleteTaskRoute = $("#deleteTaskRoute").val();
const sortTasksRoute = $("#sortTasksRoute").val();
const message = $("#message");


$("#contents").load(loginRoute);

function login() {
    message.innerHTML = "";
    const username = $("#loginName").val();
    const password = $("#loginPass").val();
    $.post(
        validateRoute,
        { username, password, csrfToken },
        data => {
            $("#contents").html(data);
        }
    );
}

function createUser() {
    message.innerHTML = "";
    const username = $("#createName").val();
    const password = $("#createPass").val();
    if (username === "" || password === ""){
        alert("Fields cannot be empty");
        return;
    }
    $.post(
        createUserRoute,
        { username, password, csrfToken },
        data => {
            $("#contents").html(data);
        }
    );
}

function deleteTask(index) {
    $.post(
        deleteTaskRoute,
        { index, csrfToken },
        data => {
            $("#contents").html(data);
        }
    );
}

function addTask() {
    const task = $("#newTask").val();
    const date = $("#newTaskDate").val();
    if (task === ""){
        alert("Task cannot be empty");
        return;
    }
    $.post(
        addTaskRoute,
        { task, date, csrfToken },
        data => {
            $("#contents").html(data);
        }
    );
}

function sortTasks() {
    $.post(
        sortTasksRoute,
        { csrfToken },
        data => {
            $("#contents").html(data);
        }
    );
}

function check(i) {
    const text = $("#task" + i);
    if ($("#check" + i).is(":checked")){
        text.addClass("crossed");
    }
    else text.removeClass("crossed");

}