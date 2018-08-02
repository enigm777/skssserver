<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<link rel="stylesheet" href="http://bootstraptema.ru/plugins/2015/bootstrap3/bootstrap.min.css" />

<style>
    .form-control{margin-bottom:13px}
</style>

<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 col-md-offset-4 well well-sm">
            <legend>Ввод статьи</legend>
            <form action="#" method="post" class="form" role="form">
                <input class="form-control" name="title" placeholder="Заголовок статьи" type="text" />
                <textarea name="article" id="message" class="form-control" rows="9" cols="25" required="required" placeholder="Текст статьи"></textarea>
                <input class="form-control" name="picture_link" placeholder="URL картинки" type="text"/>
                <label>Дата публикации</label>
                <div class="row">
                    <div class="col-xs-4 col-md-4">
                        <select class="form-control">
                            <option value="День">День</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                            <option value="21">21</option>
                            <option value="22">22</option>
                            <option value="23">23</option>
                            <option value="24">24</option>
                            <option value="25">25</option>
                            <option value="26">26</option>
                            <option value="27">27</option>
                            <option value="28">28</option>
                            <option value="29">29</option>
                            <option value="30">30</option>
                            <option value="31">31</option>
                        </select>
                    </div>
                    <div class="col-xs-4 col-md-4">
                        <select class="form-control">
                            <option value="Месяц">Месяц</option>
                            <option value="Январь">Январь</option>
                            <option value="Февраль">Февраль</option>
                            <option value="Март">Март</option>
                            <option value="Апрель">Апрель</option>
                            <option value="Май">Май</option>
                            <option value="Июнь">Июнь</option>
                            <option value="Июль">Июль</option>
                            <option value="Август">Август</option>
                            <option value="Сентябрь">Сентябрь</option>
                            <option value="Октябрь">Октябрь</option>
                            <option value="Ноябрь">Ноябрь</option>
                            <option value="Декабрь">Декабрь</option>
                        </select>
                    </div>
                    <div class="col-xs-4 col-md-4">
                        <select class="form-control">
                            <option value="Год">Год</option>
                            <option value="2016">2016</option>
                            <option value="2016">2017</option>
                            <option value="2016">2018</option>
                            <option value="2016">2019</option>
                            <option value="2016">2020</option>
                            <option value="2016">2021</option>
                            <option value="2016">2022</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Отправить</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
