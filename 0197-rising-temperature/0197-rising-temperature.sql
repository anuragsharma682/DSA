Select Today.id from Weather As Today 
Inner join Weather as yesterday on(date_sub(Today.recordDate,INTERVAL 1 DAY)=yesterday.recordDate) Where Today.temperature>yesterday.temperature;
