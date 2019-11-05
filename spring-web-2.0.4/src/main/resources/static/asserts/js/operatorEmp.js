$(function() {
   $(".deleteBtn").click(function() {
       $("#deleteEmpForm").attr("action", $(this).attr("del_uri")).submit();
       return false;
   });
});