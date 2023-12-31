#!/bin/bash

# Run the default MySQL initialization
/docker-entrypoint.sh mysqld &

# Wait for MySQL to be ready
sleep 10

# Execute custom initialization script
echo $MYSQL_ROOT_PASSWORD
mysql -u root -p $MYSQL_ROOT_PASSWORD < /docker-entrypoint-initdb.d/init.sql

# Keep the container running
tail -f /dev/null
