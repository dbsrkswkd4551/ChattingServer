<h3>Postman으로 Chatting Server 생성</h3>

POST, localhost:8080/chat (ChatController의 (@PostMapping)createRoom 실행)
Body -> x-www-form-urlencoded -> key: name, value: 채팅방이름 ->send

Chrome 확장프로그램 Simple Web Socket Client 다운
url에 ws://localhost:8080/ws/chat 입력 후 연결
Request 부분에 JSON 형식으로 작성 후 send
