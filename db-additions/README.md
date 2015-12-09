App Example Data
-----------------

use the mongorestore tool to pick up the bson files
make sure you're in the root of ./national-park-example-data

then run

	mongorestore -h 127.0.0.1 -d test

it should pick up all the .bson files
