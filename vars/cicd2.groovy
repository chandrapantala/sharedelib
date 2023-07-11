def Newgit
{
  git 'https://github.com/intelliqittrainings/maven.git'
}
def Maven
{
  sh 'mvn package'
}
def dep
{
  deploy adapters: [tomcat9(credentialsId: 'b421bc98-8b7a-4207-bf87-f03a9e1bb01c', path: '', url: 'http://172.31.89.185:8080')], contextPath: 'testapp1', war: '**/*.war'
}
