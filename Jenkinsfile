
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
            commitMessage1 = commitMessage.toLowerCase().replaceAll("\\s","")
            echo "${commitMessage1}"
            if (commitMessage.toLowerCase().replaceAll("\\s","").endsWith(" dev") && branchName.endsWith("origin/master")) {
                echo "PUFFFF"
            } else {
                echo "fuckoff"
            }
        }
    }
