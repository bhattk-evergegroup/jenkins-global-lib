def call(Map config = [:]) {
    node {
        stage('Static Analysis') {
            echo 'Run the static analysis to the code'
            echo "App Name - ${config.appName}"
            println("IOP Assignment Group: ${config.iopAssignmentGroup}")
        }
    }
}
