# دستورالعمل‌ها

یک ساعت پیاده‌سازی کنید که زمان‌ را بدون تاریخ‌ مدیریت کند.

شما باید بتوانید دقایق را به آن اضافه یا کم کنید.

دو ساعت که زمان یکسانی را نشان می‌دهند باید به هنگام مقایسه با یکدیگر مساوی باشند.

برای برآورده کردن الزام اینکه دو ساعت فقط زمانی یکسان در نظر گرفته می‌شوند که به یک زمان تنظیم شده باشند، شما باید متدهای [`equals`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals(java.lang.Object)) و [`hashcode`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode) را در کلاس `Clock` خود بازنویسی کنید.

برای اطلاعات بیشتر در مورد چگونگی بازنویسی این متدها، به [این مقاله JavaWorld](https://web.archive.org/web/20170528222153/http://www.javaworld.com/article/2072762/java-app-dev/object-equality.html) مراجعه کنید.
