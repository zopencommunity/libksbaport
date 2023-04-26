node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/libksbaport.git'), string(name: 'PORT_DESCRIPTION', value: 'Libksba is a library to make the tasks of working with X.509 certificates, CMS data and related objects more easy. It provides a highlevel interface to the implemented protocols and presents the data in a consistent way. There is no more need to worry about all the nasty details of the protocols.' )]
  }
}
