# C24 Camel Getting Started

This project shows the use of C24, C24-Camel, Camel DSL and Spring Boot

There are two message flows:

* Inbound Flow - A file poller reads files from a directory, parses XML input to Purchase Orders, validates and transforms to a flat file format and persists messages to a database and file system
* Outbound Flow - A jdbc poller reads rows from a database, maps rows to object instances, transforms the results to Json and sends to a JMS queue

It can also be used as a template for starting a new C24 Camel project.

See docs/Getting Started With C24 and Camel



    
