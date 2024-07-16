def call(){
  def pom = readMavenPom file: 'pom.xml'
  def version =pom.version
  def repoName ="ai-leads"
      if(version.endsWith("SNAPSHOT")){
            repoName="ai-leads-snapshot"
          }    
        nexusArtifactUploader artifacts: [[artifactId: 'ai-leads', classifier: '', file: 'target/ai-leads.war', type: 'war']], credentialsId: 'Nexus3', groupId: 'in.javahome', nexusUrl: '172.31.41.78:8081', nexusVersion: 'nexus3', protocol: 'http', repository: "${repoName}", version: version
}
