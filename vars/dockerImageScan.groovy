def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
    trivy image ${ecr_repoName}:latest > scan.txt
    cat scan.txt

    """
}