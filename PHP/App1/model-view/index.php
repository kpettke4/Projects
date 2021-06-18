<?php

use yii\helpers\Html;
use yii\grid\GridView;
use yii\widgets\Pjax;
/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Modele pojazdów';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="model-view-index">

    <h1><?= Html::encode($this->title) ?></h1>

   

    <?php Pjax::begin(); ?>

    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'marka',
            'rocznik',
            'kolor',
            'rodzaj_nadwozia',
            'typ_silnika',
            'id_modelu',

            
        ],
    ]); ?>

    <?php Pjax::end(); ?>

</div>
