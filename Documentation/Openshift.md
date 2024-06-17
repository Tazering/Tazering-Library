# ***OpenShift***

## **General Notes**
- Red Hat's Platform-As-A-Service (PaaS)
- flavors
  - *origin*: open source application container platform
  - *online*: public application development hosting service
  - *dedicted*: manged private cluster on AWS/Google Clouds
  - *enterprise*: on-premise private PaaS
- **clusters**: a group of servers
- **origin**
  - based on docker containers and kubernetes cluster manager
  - added tools for rapid application development, deployment, and lifecycle management
- **docker**: fundamental technology for creating self-contained, reusuable images
- **kubernetes**: handles deployment and management
- **tools**: provides layer of tools for docker and kubernetes
  - SCM
  - pipelines
  - registry
  - software defined networking
  - api
  - governance  

### **Architecture**

**Components**
- kubernetes
- etcd
- openshift

The nodes/minions host application; masters host api server, etcd datastore and the scheduler

Uses kubernetes as orchestrator
Containers created from images
Nodes have containers
**pod**: multiple containers
**deployment**: multiple pods
built-in SCM -> CI/CD => container registry => stores information for the images
nodes managed by one or more master nodes

### **Management**

- 3 ways to interact with openshift
  - web console
    - service catalog
    - manage projects, builds, deployments, services, and builds
  - cli
    - command line management
    - openshift website
    - set path in oc environment ```minishift oc-env```
    - copy command and paste
    - ```oc login``` to login or ```oc login -u <username> -p <password>```
    - ```oc logout``` to logout
  - rest api
    - ```curl https://localhost:8443/oapi/v1/users \ -H "Authorization: Bearer <Token>"```
    - ```oc whoami -t``` to get token

- has way to allow users work in isolated environments while sharing the same infrastructure
- kubernetes has *namespaces* that provides basic grouping functionality
  - Openshift makes isolation and grouping functionality off of the namespace
    - automatically handles namespaces
- Users
  - regular
    - basic developer
  - system user
    - infrastructure such as cluster administrator
    - admin/master
    - prefix of *system*
  - service account
    - as needed
    - enable communication between services
- **OAuth Server**: handles authentication
  - allow all
  - deny all
    - edit by config file

### **Source Code Management**

- built-in integration to source code management tools
- Build
  - create builds
  - download source
  - build image
  - push to registry
- Deployment
  - push to registry
  - deploy

### **Application Deployment**

### **Networks, Services, Routes, and Scaling**

- each pod has IP address
  - need to communicate with each other
- handled by OpenShift SDN
  - software defined networks
  - called "overlay"
  - uses Open vSwitch layout
    - virtual switch
    - default IP address: <mark>10.128.0.0/14</mark>
- built-in DNS server
  - uses SkyDNS
- Recommended: <mark>use services</mark>
- **ovs**: assigns each project with unique virtual id

**Services and Routes**

- services
  - acts as load balancers
  - exposes/handles pods using a selector
  - parts
    - port for proxy to listen on
    - selector to determine which pod
- route
  - provides way of connection for external users using host net
  - load balancing
    - protocols include *source*, *round robin*, and *leastconn*
  - security
  - split strategy
  - `host` field shows the DNS of application
  - `weight` field balances the load of pods

**Scaling**: change # of replicas

**DeploymentConfig**
- serve as template for pods
- have multiple pods
- by default, creates a new replication controller everytime a new version of the application comes out

**Replication Controllers**
- control and monitor the number of pods in a deployment config

**ConfigMaps**
- holds configuration data for pods to use
- has 1MB limit
- any resource can use

### **Storage**

- containers supposed to last short period of time
  - persistent volumne
  - supported plugins 

### **Commands**
`crc setup`: verify if configuration was sucessfully downloaded

`exit`: exits the pod shell

```oc adm policy add-cluster-role-to-user cluster-admin <username>``` make username as cluster admin

`oc create <resource type> <name of resource> <data of resource>`: creates a new resource with given parameters
- `... configmap <name of configmap> <data of configmap>`: creates a new config map with specified data
- `... configmap <name of cm> --from-file=<name of file>`: creates a new config map from a specified directory

`oc delete ...`: deletes a resource
- `... <resource type> <resource name>` OR `... <resource type>/<resource name>`: deletes the resource
- `... all -l <label>`: deletes all things with the associated label

`oc describe <resource>`: describes a resource
- `<resource type>/<resource>`: describes a particular resource given its type

`oc explain <item to explain>...`: fetches the built-in documentation for your item of interest
- `pod ...`: for pods
- `pod.spec...`: for the spec section
- `pod.spec.containers`: for the containers section
- `pod.spec.containers.env`: for the env sections (look at the yaml file)
- `services`: explains services

`oc expose ...`: exposes a pod to a given port
- `... --port <port #> <pod>`: exposes a pod via a given port
- `... <service>`: creates a route for your application

`oc get <resource type>`: grabs the list of running pods
- `dc`: grabs deployment config
- `istag`: grabs image tag
- `pods..`: grabs lists of pods
  - `.. -o wide`: grabs the ip addresses of the pods
  - `.. --watch`: watches progress of pods
- `projects`: grabs projects
- `rc`: grabs the replication controllers
- `svc..` grabs the list of services
- `users`: grabs the users
- `-o yaml <resource type>/<resource name>`: grabs the output in yaml format

```oc login -u system:admin``` login as system admin user

`oc logs -f <build type>/<build name>`: tracks progress of a build

`oc new-app <image tag/gitlab repository> --as-deployment-config`: creates a new deployment configuration 

`oc new-project <name of project>`: setup a new project

`oc project <name of project>`: switch to a different project

`oc projects`: list all projects 

`oc rsh <pod name>`: opens shell terminal of a pod

`oc set env dc/<name of dc> --from cm/<name of config map>`: sets environment variables in the pods of the deploymentconfig with that in the configmap

`oc whoami`: shows information about the active user

## **Setup**
- hosted on public or private clouds
- hosted on premise or cloud
- options
  - **All-In-One**: master and node on one system
    - development only
  - **Single Master Multiple Nodes**
  - **Multiple Master Multiple Nodes**
- installation
  - installation with **rpm**
  - docker
- minishift combines all the components and packaged into **iso** image
  - executable command line for virtualization platform
  - need hypervisor

### **Minishift Download**

**Windows**
1. install virtualbox
2. install minishift on your device at [this link](https://github.com/minishift/minishift/releases)
3. extract the file and copy the path that has the files
4. place it in your *PATH* environment
5. run ```minishift start --vm-driver virtualbox``` on powershell


**Linux**
1. create a linux machine using a hypervisor preferably fedora
2. install libvirt and quemu update
   ```bash
   sudo dnf install ibvirt qemu-kvm
   ```
3. add yourself to the *libvirt* group to avoid *sudo* ```sudo usermod -a -G libvirt <username>```
4. update group session ```newgrp libvirt```
5. install docker machine 
   ```
   sudo curl -L https://github.com/dhiltgen/docker-machine-kvm/releases/download/v0.7.0/docker-machine-driver-kvm -o /usr/local/bin/docker-machine-driver-kvm
   sudo chmod +x /usr/local/bin/docker-machine-driver-kvm
   ```



## **Resources**

[KodeKloud's OpenShift for Absolute Beginners](https://www.udemy.com/course/learn-openshift/?kw=openshift+for+absolute&src=sac)








