pipelineJob('Pipeline1234') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/shanmukha511/in.biomni.app.git')
               
            }
        }
    }
}
