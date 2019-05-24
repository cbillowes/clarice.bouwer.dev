#!/usr/bin/env bash

scp clarice_bouwer_dev.tgz root@$1:/opt/
ssh root@$1 mkdir -p /opt/clarice.bouwer.dev
ssh root@$1 rm -rf /opt/clarice.bouwer.dev/*
ssh root@$1 tar xzf /opt/clarice_bouwer_dev.tgz -C /opt/clarice.bouwer.dev
