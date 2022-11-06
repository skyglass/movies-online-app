docker kill movies-api
docker rm movies-api

docker run -d --name movies-api \
  -p 80:8080 \
  skyglass/movies-api:1.0.0
