1. The Observer Pattern is like a subscription system
2. There's a primary Class, like a YouTube channel.
   Posts new videos.
   Keeps a list of subscribers.
   Notifies subscribers when there’s a new video.
3. There are subscribers (the observers), like Person or Bot who subscribe to that channel.
   Get notified whenever a new video is posted.
   Each subscriber can decide what to do with the notification.
4. Whenever the YouTube channel posts a new video (state change), it notifies all subscribers about it