#!/bin/bash

echo "Conversion Log press ==> 1"
echo "Click Log press ==> 2"


function conversions {

 rm ResultConversions.csv > /dev/null 2>&1
 sed 1d conversions.csv > conversions_.csv

 awk -F "\"" '{print  "(" $12 ")"  " " $6 }' conversions_.csv  | sort | uniq -c | awk 'NF{NF-=1};1' |  uniq -c  >> file_1.log


 awk '{$1=$2=""; print $0}' file_1.log | awk '{print $0";"}'>> col1.log
 awk '{print $2}' file_1.log | awk '{print $0";"}' >> col2.log
 awk '{print $1}' file_1.log | awk '{print $0";"}' >> col3.log

 pr -mts' ' col1.log col2.log col3.log >> ResultConversions.csv

 rm file_1.log
 rm conversions_.csv
 rm col1.log
 rm col2.log
 rm col3.log
}

function clicks {

 rm ResultClicks.csv > /dev/null 2>&1

 sed 1d clicks.csv > export_.csv

 awk -F "\"" '{print  "(" $10 ")"  " " $4 }' export_.csv  | sort | uniq -c | awk 'NF{NF-=1};1' | uniq -c  >> file_1.log


 awk '{$1=$2=""; print $0}' file_1.log | awk '{print $0";"}'>> col1.log
 awk '{print $2}' file_1.log | awk '{print $0";"}' >> col2.log
 awk '{print $1}' file_1.log | awk '{print $0";"}' >> col3.log

 pr -mts' ' col1.log col2.log col3.log >> ResultClicks.csv

 rm file_1.log
 rm export_.csv
 rm col1.log
 rm col2.log
 rm col3.log
}

read item
case "$item" in
    1) conversions
        ;;
    2) clicks
        exit 0
        ;;
    *) echo "Incorrect input data..."
        ;;
esac
