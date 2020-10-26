<h3>CH1</h3>
<h3>Postman으로 Chatting Server 생성</h3>

POST, localhost:8080/chat (ChatController의 (@PostMapping)createRoom 실행)
Body -> x-www-form-urlencoded -> key: name, value: 채팅방이름 ->send

Chrome 확장프로그램 Simple Web Socket Client 다운
url에 ws://localhost:8080/ws/chat 입력 후 연결
Request 부분에 JSON 형식으로 작성 후 send


<h3>CH2</h3>
<h3>Stomp로 채팅서버 고도화 하기</h3>
Stomp는 메시징 전송을 효율적으로 하기 위해 나온 프로토콜이며, pub/sub구조로 되어있어 메시지를 발송하고, 메시지를 받아 처리하는 부분이 확실히 정해져있어 개발하는 입장에서 명확하게 인지하고 개발이 가능하다. 또한 통신 메시지 헤더에 값을 세팅할 수 있어서 헤더 값을 기반으로 통신 시 인증 처리를 구현하는 것도 가능하다.

pub/sub은 메시지를 공급하는 주체와 소비하는 주체를 분리하여 제공하는 메시징 방법이다. 














참고 url: https://daddyprogrammer.org/post/4691/spring-websocket-chatting-server-stomp-server/
