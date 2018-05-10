<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 10.05.18
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset=utf-8>
    <title>My first three.js app</title>
    <style>
        body { margin: 0; }
        canvas { width: 100%; height: 100% }
    </style>
</head>
<body>

<script src="/resources/js/three.js"></script>
<script src="/resources/js/OrbitControls.js"></script>
<script>

    //////////////////////////////////////////////////////////////////////////////////////////////

    //Scene, camera, rendering and add this to a dom od html
    var scene = new THREE.Scene();
    var camera = new THREE.PerspectiveCamera( 75, window.innerWidth / window.innerHeight, 1, 10000 );
    var renderer = new THREE.WebGLRenderer();
    renderer.setSize( window.innerWidth, window.innerHeight );
    document.body.appendChild( renderer.domElement );

    camera.position.z =30;

    //////////////////////////////////////////////////////////////////////////////////////////////

    //Enable resize window
    window.addEventListener('resize', function(){


        var width = window.innerWidth;
        var height = window.innerHeight;
        renderer.setSize(width,height)
        camera.aspect = width/height;
        camera.updateProjectionMatrix();

    });

    //////////////////////////////////////////////////////////////////////////////////////////////

    //Control

    controls = new THREE.OrbitControls(camera, renderer.domElement)
        </script>
<c:forEach items="${f54SpotPoints}" var="f54Spot">

    <script>
        //////////////////////////////////////////////////////////////////////////////////////////////
        var geometry = new   THREE.BoxGeometry( 0.1, 0.1, 0.1 );
        var material = new THREE.MeshBasicMaterial( { color: 0x00ff00 } );
        var cube = new THREE.Mesh( geometry, material );

        cube.position.x = ${f54Spot.getPointX()/100};
        cube.position.y = ${f54Spot.getPointY()/100};
        cube.position.z = ${f54Spot.getPointZ()/100};

        scene.add( cube);
    </script>
</c:forEach>
        <script>


        //////////////////////////////////////////////////////////////////////////////////////////////


        function animate() {
            requestAnimationFrame( animate );
            renderer.render( scene, camera );


        }
        animate();


    </script>





</body>
</html>
