(function (){
    const socket = io.connect('http://127.0.0.1:9000');

    socket.on('connect', () => {
        console.log('Hello from websocket connection')
    })


})()