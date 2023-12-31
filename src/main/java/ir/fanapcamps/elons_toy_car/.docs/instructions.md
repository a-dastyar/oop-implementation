# صورت مساله

در این تمرین، شما با یک ماشین کنترل از راه دور بازی می‌کنید که بالاخره پول کافی برای خرید آن را پس‌انداز کرده‌اید.

ماشین‌ها با باتری‌های کامل (100٪) شروع می‌کنند. هر بار که شما با استفاده از کنترل از راه دور ماشین را برانید، 20 متر پیش می‌رود و یک درصد از باتری آن تخلیه می شود.

ماشین کنترل از راه دور یک نمایشگر LED شیک دارد که دو اطلاعات را نشان می‌دهد:

- مجموع مسافتی که رانده شده، نمایش داده شده به صورت: `"Driven <METERS> meters"`.
- شارژ باقی‌مانده باتری، نمایش داده شده به صورت: `"Battery at <PERCENTAGE>%"`.

اگر باتری 0٪ باشد، دیگر نمی‌توانید ماشین را برانید و نمایشگر باتری نشان می‌دهد `"Battery empty"`.

شما شش وظیفه دارید که هر کدام با ماشین کنترل از راه دور کار می‌کنند.

## 1. خرید یک ماشین کنترل از راه دور نو

متد (_استاتیک_) `ElonsToyCar.buy()` را پیاده‌سازی کنید تا یک instance نو از ماشین کنترل از راه دور برگرداند:

```java
ElonsToyCar car = ElonsToyCar.buy();
```

## 2. نمایش مسافت رانده شده

متد `ElonsToyCar.distanceDisplay()` را پیاده‌سازی کنید تا فاصله را همانطور که روی نمایشگر LED نمایش داده می‌شود، برگرداند:

```java
ElonsToyCar car = ElonsToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"
```

## 3. نمایش درصد باتری

متد `ElonsToyCar.batteryDisplay()` را پیاده‌سازی کنید تا درصد باتری را همانطور که روی نمایشگر LED نمایش داده می‌شود، برگرداند:

```java
ElonsToyCar car = ElonsToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"
```

## 4. به‌روزرسانی مسافت رانده شده به متر هنگام رانندگی

متد `ElonsToyCar.drive()` را پیاده‌سازی کنید که مسافت رانده شده به متر را نمایش دهد:

```java
ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"
```

## 5. به‌روزرسانی درصد باتری هنگام رانندگی

متد `ElonsToyCar.drive()` را پیاده سازی کنید تا درصد باتری را نمایش دهد:

```java


ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"
```

## 6. جلوگیری از رانندگی وقتی باتری تخلیه شده است

متد `ElonsToyCar.drive()` را پیاده سازی کنید تا زمانی که باتری تخلیه شده است (در 0٪)، مسافت رانده شده افزایش و درصد باتری کاهش نیابد:

```java
ElonsToyCar car = ElonsToyCar.buy();

// Drain the battery
// ...

car.distanceDisplay();
// => "Driven 2000 meters"

car.batteryDisplay();
// => "Battery empty"
```
