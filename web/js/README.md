# Buzz, a Javascript HTML5 Audio library

Buzz is a small but powerful Javascript library that allows you to easily take advantage of the new HTML5 audio element. It tries to degrade properly on non-modern browsers.

    var mySound = new buzz.sound( "mp3/TopGear.mp3", {
        formats: [ "ogg", "mp3", "acc" ]
    });
	
    mySound.play()
        .fadeIn()
        .loop()
        .bind( "timeupdate", function() {
            var timer = buzz.toTimer( this.getTime() );
            document.getElementById( "timer" ).innerHTML = timer;
        });
