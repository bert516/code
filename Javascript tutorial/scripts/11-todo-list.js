const todos = [];
renderTodoList()

function renderTodoList() {
  let todoListHTML = "";
  for (let i = 0; i < todos.length; i++) {
    const todo = todos[i];
    const html = `<p>${todo}</p>`;
    todoListHTML += html;
  } 
  document.querySelector(".js-todo-list").innerHTML = todoListHTML;
}

function add() {
  const task = document.querySelector("input").value;
  todos.push(task);
  console.log(todos);
  
  document.querySelector("input").value = "";
  renderTodoList();
}