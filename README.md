# stock-inventory-management
    Stock Inventory Management application runs in port number 8080.

# API
  > POST -  http://localhost:8000/api/stocks
  * Help to create stock

  > Request Json:
 ```sh
  {
    "name" : "stock2",
    "price" : 20,
    "date" : "2020-08-21"
  }
 ```
 > Response  Json:
 ```sh
  {
    "number": "8a966dd9-2d27-42ff-acf8-703bf8c1cac4",
    "name": "stock2",
    "price": 20,
    "date": "2020-08-21T16:03:11.943+00:00",
    "quantity": "AVAILABLE"
  }
 ```
 > PUT -  http://localhost:8000/api/stocks/{number}
  * Help to update stock

  > Request  Json:
 ```sh
    {
      "price" : 100,
      "name": "stock1"
    }
 ```
  > Response  Json:
 ```sh
    {
      "number": "0283c6b7-19c4-4582-8a7b-a7d9454b7610",
      "name": "stock1",
      "price": 100,
      "date": "2020-08-21T16:11:19.459+00:00",
      "quantity": "AVAILABLE"
  }
 ```
 > GET -  http://localhost:8000/api/stocks
  * Help to get all stocks
  > Response Json
  ```sh
    [
      {
        "number": "0283c6b7-19c4-4582-8a7b-a7d9454b7610",
        "name": "stock1",
        "price": 10,
        "date": "2020-08-21T16:11:19.459+00:00",
        "quantity": "AVAILABLE"
      },
      {
        "number": "9a126aca-ffac-4ebf-b513-9b0d95306a40",
        "name": "stock2",
        "price": 20,
        "date": "2020-08-21T16:11:19.529+00:00",
        "quantity": "AVAILABLE"
      }
    ]
 ```
