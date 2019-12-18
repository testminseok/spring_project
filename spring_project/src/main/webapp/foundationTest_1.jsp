<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.tag-cloud-section {
  background: #7b93a4;
  padding: 4rem;
  max-width: 800px;
  margin: 0 auto;
}

.tag-cloud-title {
  text-align: center;
  text-transform: uppercase;
  font-weight: bold;
  color: #e6e6e6;
  border-bottom: 1px solid #cacaca;
  padding: 1rem 0;
  margin-bottom: 1rem;
}

.tag-cloud {
  margin: 1rem;
  text-align: center;
  list-style: none;
}

.tag-cloud .tag-cloud-individual-tag {
  display: inline-block;
  padding: 0.33333rem 0.5rem;
  border-radius: 0;
  font-size: 0.8rem;
  line-height: 1;
  white-space: nowrap;
  cursor: default;
  border-radius: 5000px;
  background: #2c3840;
  display: inline-block;
  color: #e6e6e6;
  margin: 3px;
  text-transform: uppercase;
  font-weight: bold;
}

.tag-cloud .tag-cloud-individual-tag .fa {
  margin-left: 7px;
  color: #e6e6e6;
}

.tag-cloud .tag-cloud-individual-tag:hover {
  background: black;
  transition: background-color .2s ease-in;
}


</style>
</head>
<body>
<section class="tag-cloud-section">
  <h5 class="tag-cloud-title">LUNCH TIME</h5>
  <div class="tag-cloud">
    <a class="tag-cloud-individual-tag" href="#">Peanut Butter<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Jelly Jam<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Grapes<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Bread<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Bananas<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Chicken Salad<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">LEmonaide<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Cheese<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Mayonaisse<i class="fa fa-times-circle" aria-hidden="true"></i></a>
    <a class="tag-cloud-individual-tag" href="#">Lettuce<i class="fa fa-times-circle" aria-hidden="true"></i></a>
  </div>
</section>


</body>
</html>