def call(groupId,repoName,artifactId,version){
 sh "curl -u admin:Vinay@2000 -O "http://172.31.41.78:8081/repository/${repoName}/${groupId}/${artifactId}/${version}/${artifactId}.war"
}
