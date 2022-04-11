
    node {
        checkout scm
        scmInfo = checkout scm
        commitMessage = bat(returnStdout:true, script:'git log -1 --oneline').trim()
                branchName = "${scmInfo.GIT_BRANCH}"

                stage("Condition") {
            echo "______________________"
            echo "${commitMessage}"
            echo "______________________"
            echo "${branchName}"
            echo "______________________"
            if (commitMessage.toLowerCase().replaceAll("\\s","").endsWith(" dev") && branchName.equals("origin/master")) {
                echo "PUFFFF"
            } else {
                echo "fuckoff"
            }
        }
    }
