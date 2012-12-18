akka-email
==========

Email generation simulation using Akka.

To try it out:

```
git clone https://github.com/dsosnoski/akka-email.git
sbt
>run
>[1 for the quick demo, 2 for the more involved demo]
>quit
```

Some issues with the current code:

- Operation is very inconsistent, especially when using relative paths (supplied code uses absolute paths)
- The /src/main/scala/reference.conf used to configure debug information appears to be ignored when run in sbt