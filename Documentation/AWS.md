# ***AWS***

## **Documentations**

- uses cloud computing for various services
- **regions**: cluster of data centers
  - factors that affect choice
    - **compliance**: data governance and legal requirements
    - **proximity**: latency for customers
    - **available services**: what services does the particular region have
    - **pricing**
- **availability zones**: discrete data centers that are isolated from each other for redundancy
  - group of availability zones = region
- **Points of Presence**: locations that can deliver content to clients very quickly

## **Services**

### **IAM**
- **Identity and Access Management (IAM)**: global service for management
  - root account for initialization
  - **users** => people
    - assigned to multiple groups
    - permissions via json document called policies
    - **policy**: permission of a particular user/group
  - **groups**: set of users
    - group-wide policies
    - policies can be inherited
- **policy structure**
  - consists
    - **version**: policy language version
    - **Id**: identity of the policy *optional*
    - **statement**: list of statements *required*

### **EC2**

- elastic compute cloud 
  - rent virtual machines
- choices
  - **Operating System**: linux, windows, or mac os
  - **CPU**: compute power & cores
  - **RAM**: random-access memory
- **bootstrapping**: launching commands when machine starts
  - run once at first start
  - any command will have `sudo` rights
- naming convention: 
  - example: *m5.2xlarge*
    - *m*: instance types
    - *5*: generation
    - *2xlarge*: size within instance type
- **EC2 Instance Types**
  - general purpose
  - computer optimized: high performance
    - machine learning
    - gaming server
  - memory optimized: large data sets in memory
    - high performance db
    - distributed cache stores
    - business intelligence
    - big unstructured data
  - storage optimized
    - high, sequential read and write access to large data sets on local storage
- **EC2 Instance Pricing**
  - **on-demand**: capacity by hour
  - **spot instance**: compete with other customers about availability of the instance
  - **reserved instance**: capacity reservation
  - **dedicated host**: physical ec2 server for user's use
- **Security Groups**: control how traffic enters and leaves the instance
  - only contain *allow* rules
  - firewalls
  - regulate
    - ports
    - IP range
    - inbound network
    - outbound network
  - <mark>if you see a TIMEOUT error, it is always a security issue</mark>
  - attached to multiple instances
  - locked to region
  - good to maintain one separate security group for ssh access
  - Ports
    - 22 = SSH
    - 21 = FTP
    - 22 = SFTP
    - 80 = HTTP
    - 443 = HTTPS
    - 3389 = RDP
- **SSH**
  - used on windows 10+, mac, and linux
  - *putty* for any version of windows
  - *ec2 instance connect*: valid for all OS using web browsers
  - windows 10+
    - `ssh -i .\<.pem file> ec2-user@<public ip>`
- **ec2 instance connect**
  - never enter access id into aws servers

### **EBS (Elastic Block Store)**

- **EBS**: network drive to attach to instance
  - basically VIRTUAL usb drive
  - cannot attacht o multiple instances
- delete on termination => can be controlled

**AMI**: Amazon Machine Image
- customization of EC2 instance
- built for specific region
- launch EC2 instance

### **S3**

- stores data
  - scalability
  - available
  - security
  - performance
- **bucket**: container for objects stored
  - can store folders
- storage classes
  - **standard**: general purpose and frequently accessed
  - **intelligent-tiering**: varying access patterns
  - **standard-infrequent**: long-lived but less frequently accessed data
  - **one zone-infrequent access**: long-lived but less frequently accessed data
  - **glacier and glacier deep archive**: long-term 
- can change anytime during the lifecycle

### **Sagemaker**

- fully-managed ML workflow pattern
- has built-in algorithms
- tools
  - labelling data
  - building models
  - training models
  - tuning models
  - deploying models
  - discover new models
- components
  - model training
    - must start training job
    - specify train data, specify output, compute resources, and elastic container
  - launches ML compute instance 
  - uses training code and dataset for training
  - saves model into S3 bucket
    - deployment
- model deployment
  - single or multiple prediction at a time
  - **sagemaker inference pipeline**: tools to process batch transforms in a pipeline format
  - **batch transform**: preproessing and model inferencing
  - **automatic scaling**: dynamically adjust number of instances provisioned
  - **elastic inference**: speed up inference and reduce latency
  - **neo**: train models and adapt to other processors 

**Sagemaker Studio**

- full IDE for ML
- all ML development activities can be performed within unifed interface
- features
  - collaboration at scale
  - easy experiment management
  - automatic model generation
  - higher quality ML models
  - increased productivity


## **Resources**

[Sagemaker Tutorial](https://www.udemy.com/course/practical-aws-sagemaker-6-real-world-case-studies/learn/lecture/20030604?start=15#overview)
