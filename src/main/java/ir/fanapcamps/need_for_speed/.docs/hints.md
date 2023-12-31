# راهنمایی ها

## 1.  ایجاد یک ماشین کنترلی

- یک [constructor][constructor-syntax] تعریف کنید که دو پارامتر `int` دارد
- دو پارامتر به عنوان [فیلد][fields] ذخیره کنید تا بتوانند به متدهای کلاس دسترسی داشته باشند.

## 2. ایجاد پیست مسابقه

- یک [constructor][constructor-syntax] دارد `int` تعریف کنید که یک پارامتر.
- پارامتر را به عنوان [فیلد][fields] ذخیره کنید تا بتوانند به متدهای کلاس دسترسی داشته باشد.

## 3. رانندگی با ماشین

- یک [فیلد][fields] اضافه کنید که مسافت طی شده را نگهدارد.
- سرعت کا را به [فیلدهای][fields] کلاس اضافه کنید تا مسافت طی شده را نگهدارد.

## 4. تمام شدن باتری را چک کنید

- یک [فیلد][fields] اضافه کنیدد تا درصد باقیمانده باتری را نگهدارد (شروع با 100%).
-  [فیلد][fields] میزان مصرف باتری را حذف کنید.
- در صورتیکه باتری تمام شده است مسافت طی شده را تغییر ندهید
- به یاد داشته باشید که اگر شارژ باتری کمتر از میزان مصرف باتری باشد، آن را خالی شده در نظر می‌گیرند.

## 5. ماشین کنترلی نیترو را بسازید

- یک [Instance][instance-constructors] از `RemoteControlCar` با پارامترهای درست بسازید.

## 6. بررسی کنید که یک ماشین کنتری امکان تمام کردن یک پیست را دارد

- بهترین راه حل این مساله راندن مداوم ماشین با [while][while] می باشد.
- به یاد داشته باشید که ماشین یک متد برای بازگرداندن مسافت طی شده دارد
- فکر کنید که چه اقدامی باید انجام دهید در صورتیکه باتری ماشین قبل از رسیدن به خط پایان تمام شود 

[constructor-syntax]: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
[instance-constructors]: https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
[while]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
[fields]: https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
