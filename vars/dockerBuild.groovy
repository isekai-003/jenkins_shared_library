def call(String project, String ImageTag,String user) {
    sh '''
      docker build -t ${user}/${project} .
      docker tag ${user}/${project} ${user}/${project}:${ImageTag}

       '''
}