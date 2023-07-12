def Newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def Maven()
{
  sh 'mvn package'
}
def Deploy()
{
  deploy adapters: [tomcat9(credentialsId: 'b421bc98-8b7a-4207-bf87-f03a9e1bb01c', path: '', url: 'http://172.31.89.185:8080')], contextPath: 'testapp', war: '**/*.war'
}
def test()
{
  sh 'java -jar '
}


