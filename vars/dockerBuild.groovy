def call(String project, String ImageTag,String user) {
   
       sh """
              docker image build -t ${user}/${project} . 
              docker image tag ${user}/${project} ${hubUser}/${project}:${ImageTag}
              docker image tag ${user}/${project} ${hubUser}/${project}:latest
          """

       
}