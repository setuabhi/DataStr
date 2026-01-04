1. The Observer Pattern is like a subscription system
2. There's a primary Class, like a YouTube channel which Keeps a list of subscribers(Interface) {List<Interface> arrL}
   Subscribe method : arrL.add(subscriber)
   UnSubscribe method : arrL.remove(subscriber)
   UploadVideo (state change) : call notify method of each subscriber
3. There are subscribers (the observers), like Person or Bot who subscribe to that channel.
   Get notified whenever a new video is posted.
   Each subscriber can decide what to do with the notification.