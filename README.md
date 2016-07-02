# FileWatcherSpringIntegration
Will continuously looking for creation of new file in specific directory once a new file is created it will look whether it is empty if so add the delayer and then convert the file in to Byte[], then delete the file from source folder and send the file to the tcp server over ssl and store the copy of the file as a Backup. 
