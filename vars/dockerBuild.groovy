def call(String aws_account_id, String region,String user) {
   
       sh """
            docker build -t ${user} .
            docker tag ${user}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/docker-ecr:latest
          """

       
}