               def ssdRoleManagerDemo(){
                bat ("ping yandex.ru")
                }
                def coreDataDemo(){
                bat ("ping google.com")
                }

                def serviceAdapter(){
                bat ("ping yahoo.com")
                }

                def packageDemo(){
                bat ("ping facebook.com")
                }
    node {
        checkout scm
        scmInfo = checkout scm
        commitMessage = bat(returnStdout:true, script:'@git log -1 --oneline').trim()
        branchName = "${scmInfo.GIT_BRANCH}"
        PACKAGE = "ping yahoo.com"

        stage("Build Demo") {
            echo "Commit message ${commitMessage}"
            commitMessage.toLowerCase()
            echo "branch name ${branchName}"
            echo "${commitMessage.contains("demo") && branchName.contains("origin/master")}"
            echo "${commitMessage.endsWith("core-data")}"
            if (commitMessage.contains("demo") && branchName.contains("origin/master")) {
                if(commitMessage.endsWith("demo all")){
                bat("${PACKAGE}")
                }
                else if(commitMessage.endsWith("core-data")){
                coreDataDemo()
                }
            } else {
                echo "Keywords not found"
            }
        }
    }
