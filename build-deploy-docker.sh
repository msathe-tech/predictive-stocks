#Steps to create Docker image and cf push
cd docker
docker build --rm -t msathepivotal/myfirst-boot-on-docker:latest .
docker images
docker run -d -p 8080:8080 myfirst-boot-on-docker:latest
docker ps
docker images
docker push msathepivotal/myfirst-boot-on-docker
#cf push acme-predictive-stock --docker-image msathepivotal/myfirst-boot-on-docker:latest
