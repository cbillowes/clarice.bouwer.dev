# Portfolio

Create a new lein project using re-frame with LESS, garden, reagenet,
re-frisk, test and secretary.

`lein new re-frame clarice +less +garden +10x +re-frisk +test +handler
+routes`

A [re-frame](https://github.com/Day8/re-frame) application designed to ... well, that part is up to you.

## Development Mode

### Compile css:

Compile css file once.

```
lein garden once
```

Automatically recompile css file on change.

```
lein garden auto
```

### Compile css:

Compile css file once.

```
lein less once
```

Automatically recompile css file on change.

```
lein less auto
```

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Build and deploy

```
./build.sh
./deploy.sh "<server>" "<user">
