// script.js
const chatInput = 
	document.querySelector('.chat-input textarea');
const sendChatBtn = 
	document.querySelector('.chat-input button');
const chatbox = document.querySelector(".chatbox");

let userMessage;
const API_KEY = ""
//OpenAI Free APIKey

const createChatLi = (message, className) => {
	const chatLi = document.createElement("li");
	chatLi.classList.add("chat", className);
	let chatContent = 
		className === "chat-outgoing" ? `<p>${message}</p>` : `<p>${message}</p>`;
	chatLi.innerHTML = chatContent;
	return chatLi;
}

const generateResponse = (incomingChatLi) => {
	const API_URL = "https://api.openai.com/v1/chat/completions";
	const messageElement = incomingChatLi
	.querySelector("p");
	const requestOptions = {
		method: "POST",
		headers: {
			"Content-Type": "application/json",
			"Authorization": `Bearer ${API_KEY}`
		},
		body: JSON.stringify({
			"model": "gpt-3.5-turbo",
			"messages": [
				{
					role: "user",
					content: userMessage
				}
			]
		})
	};

	fetch(API_URL, requestOptions)
		.then(res => {
			if (!res.ok) {
				throw new Error("Mạng của bạn không ổn định.");
			}
			return res.json();
		})
		.then(data => {
			messageElement
			.textContent = data.choices[0].message.content;
		})
		.catch((error) => {
			messageElement
			.classList.add("errorChat");
			messageElement
			.textContent = "Có lỗi xảy ra.";
		})
		.finally(() => chatbox.scrollTo(0, chatbox.scrollHeight));
};


const handleChat = () => {
	userMessage = chatInput.value.trim();
	if (!userMessage) {
		return;
	}
	chatbox
	.appendChild(createChatLi(userMessage, "chat-outgoing"));
	chatbox
	.scrollTo(0, chatbox.scrollHeight);

	setTimeout(() => {
		const incomingChatLi = createChatLi("Suy nghĩ...", "chat-incoming")
		chatbox.appendChild(incomingChatLi);
		chatbox.scrollTo(0, chatbox.scrollHeight);
		generateResponse(incomingChatLi);
	}, 600);
}

sendChatBtn.addEventListener("click", handleChat);
var chatbotcomplete = document.querySelector(".chatBot");
var toggleChatBot=document.querySelector('.toggleChatBot')
function cancel() {
	chatbotcomplete.style.scale = "0";
	setTimeout(function(){
		toggleChatBot.style.display="block"
	},210)
	
}
function openChatBot(){
	chatbotcomplete.style.scale = "1";
	toggleChatBot.style.display="none"

}
