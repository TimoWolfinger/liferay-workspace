<%@ include file="/init.jsp" %>
<!-- BITTE FOLGENDES ENTKOMMENTIEREN, SOFERN EIGENE STYLESHEETS IN DEN KOMPONENTEN VERWENDET WERDEN -->
<!--<link href="/o/${artifactId}-1.0.0/dist/main.css" rel='stylesheet'/> -->
<!-- BITTE FOLGENDES ENTKOMMENTIEREN, SOFERN Bootsrap o.ä STYLESHEETS IN DEN KOMPONENTEN VERWENDET WERDEN -->
<link href="/o/${artifactId}-1.0.0/dist/vendor.css" rel='stylesheet'/>
<script src=/o/${artifactId}-1.0.0/dist/runtime.js></script>
<script src=/o/${artifactId}-1.0.0/dist/vendor.js></script>
<script src=/o/${artifactId}-1.0.0/dist/main.js></script>
<div id="<portlet:namespace />-1"></div>
<script>
    window.onload = function () {
        entryPoint.main('<portlet:namespace />');
    }
</script>