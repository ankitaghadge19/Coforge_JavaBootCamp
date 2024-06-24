// Type for date
type DateType = {
    day: number;
    month: string;
    year: number;
};

// Type for time
type TimeType = {
    hour: number;
    minute: string;
};

// Intersection type combining DateType and TimeType
type DateAndTime = DateType & TimeType;

const dateTimeObj: DateAndTime = {
    day: 12,
    month: 'Jun',
    year: 2024,
    hour: 12,
    minute: '00'
};

function displayDateTime(dateTime: DateAndTime) {
    const { day, month, year } = dateTime;
    const { hour, minute } = dateTime;

    // Display formatted date and time
    console.log(`${day} ${month} ${year} ${hour}.${minute}`);
}

displayDateTime(dateTimeObj);

