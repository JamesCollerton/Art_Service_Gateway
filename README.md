[![Build Status](https://travis-ci.com/JamesCollerton/Art_Service_Gateway.svg?branch=master)](https://travis-ci.com/JamesCollerton/Art_Service_Gateway)
[![codecov](https://codecov.io/gh/JamesCollerton/Art_Service_Gateway/branch/master/graph/badge.svg)](https://codecov.io/gh/JamesCollerton/Art_Service_Gateway)

# Art Service Gateway

This is the art service Zuul gateway.

Detail | Value
------------ | -------------
Port Number | 8762
Spring Application Name | art-service-gateway
ECR Repository Name | art-service-gateway
ECS Service/ Task Name |

## What is Zuul?

Routing is an integral part of a microservice architecture. For example, / may be mapped to your web application, /api/users is mapped to the user service and /api/shop is mapped to the shop service. Zuul is a JVM-based router and server-side load balancer from Netflix. It can be used to apply filters to requests as they come through the edge service and can be used for:

- Authentication
- Insights
- Stress Testing
- Canary Testing
- Dynamic Routing
- Service Migration
- Load Shedding
- Security
- Static Response handling
- Active/Active traffic management
