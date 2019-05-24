#!/usr/bin/env bash

lein clean
lein less once
lein cljsbuild once min

cd resources/public/
tar -czf ../../clarice_bouwer_dev.tgz .
