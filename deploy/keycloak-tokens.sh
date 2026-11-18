#!/bin/bash

KCHOST=http://localhost:8081
REALM=recipe-book
CLIENT_ID=recipe-book-service
UNAME=recipe-user
PASSWORD=recipe-pass


ACCESS_TOKEN=`curl -XPOST \
  -d "client_id=$CLIENT_ID" \
  -d "username=$UNAME" \
  -d "password=$PASSWORD" \
  -d "grant_type=password" \
  "$KCHOST/realms/$REALM/protocol/openid-connect/token"  | jq -r '.access_token'`
echo "$ACCESS_TOKEN"