# SwipeRefreshLayoutExample
Swipe Refresh Layout Android Example

Ví dụ này mình sẽ hướng dẫn các bạn sử dụng SwipeRefreshLayout với RecyclerView trong ứng dụng Android.

Để có thể luôn hiển thị những dữ liệu mới nhất, chúng ta thường thực hiện cập nhật dữ liệu một cách tự động trong 1 thời gian ngắn hoặc 1 thời gia khá dài, trong nhiều trường hợp đó không phải hoàn toàn là một cách hay từ phía user, nó có thể gây tiêu tốn lưu lượng mà khiến user thấy đó là không cần thiết hoặc cũng có thể khiến user thấy lâu có hàng mới thế. Vì vậy sao ta ko để user có thể tự mình cập nhật dữ liệu mới khi thấy cần thiết. Và thật hay ho là nền tảng Android cung cấp cho chúng ta một design pattern swipe-to-refresh để thực hiện việc đó.

<strong>Chú ý:</strong> Lớp này yêu cần phiên bản mới nhất của Android v4 Support Library APIs.

Ví dụ đối với các ứng dụng thời tiết, khi user muốn biết bây giờ lạnh bao nhiêu độ thì chỉ đơn giản là kéo ngón tay từ top màn hình xuống để refresh data, thật tiện lợi phải không.

<a href="http://ntcde.com/android/su-dung-swiperefreshlayout-trong-ung-dung-android.html"><img class="size-large" title=' Sử dụng SwipeRefreshLayout trong ứng dụng Android' src="https://i.imgur.com/WIy2lYJ.gif" alt="Sử dụng SwipeRefreshLayout trong ứng dụng Android" width="444" height="732" /></a>

<a href="http://ntcde.com/android/su-dung-swiperefreshlayout-trong-ung-dung-android.html"><img class="size-large wp-image-2003" src="http://ntcde.com/wp-content/uploads/2017/04/2dev4u.comSử-dụng-SwipeRefreshLayout-trong-ứng-dụng-Android-576x1024.png" title='Sử dụng SwipeRefreshLayout trong ứng dụng Android' alt="Sử dụng SwipeRefreshLayout trong ứng dụng Android" width="576" height="1024" /></a> 
