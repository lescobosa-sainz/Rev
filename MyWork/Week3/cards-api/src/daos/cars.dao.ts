import Car from "../models/car";

let cars: Car[] = [
    new Car(1,'nissan','gt-r',120000,2019,'nismo','white')

];

export function findAll(): Car[] {
    return cars;
}

export function findByVin(vin: number): Car {
    return cars.filter(cars => cars.vin === vin)[0];
}

export function findByBrand(brand: string): Car[] {
    return cars.filter(car => car.brand === brand);
}

export function save(car?: Car) {
    const newVIN = Math.floor(Math.random() * 100000000);
    car.vin = newVIN;
    cars.push(car);
}



/**
 * {
 *  id: 1,
 * username: 'lescobosa'
 * password: 'pass'
 * firstName: 'luis'
 * lastName: 'escobosa'
 * email: 'lescobosa@hotmail.com'
 * phone: 'c136'
 * }
 * 
 * {
 *  id: 1,
 *  phone: 'c136'
 * }
 * @param user 
 */
export function patch(car: Partial<Car>) {
    cars = cars.map(ele => {
        if(car.vin === ele.vin) {
            return {
                ...ele,
                ...car
            }
        } else {
            return ele
        }
    });
}

export function deleteUser(vin: number) {
    cars = cars.filter(car => car.vin !== vin);
}