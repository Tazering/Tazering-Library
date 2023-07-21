# ***Docker***

- **containers**: completed isolated environments
  - own processes and services
  - own OS
- uses LXC containers
- all OS consists of OS kernel and set of software
  - OS kernel => interacts with hardware
  - software => differentiates with various types of OS
- Sharing the kernel
  - docker can run any flavor of OS as long as kernel is the same
  - e.g docker on OS-Ubuntu can run any linux distribution because linux kernel is the same
- lightweight version of virtual machine because does need underlying OS in each container
- to run instance of software

```bash
docker run ansible
```

- **images**: package or template to create one or more containers
  - containers are running instances of images that are self-contained and have own processes and operations
- 
