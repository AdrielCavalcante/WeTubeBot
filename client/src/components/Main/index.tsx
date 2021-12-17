import React from "react";

import { Container, Title, Comandos, Comando, Nome, Descricao, Sinonimos, Exemplo } from "./styles";

const Main: React.FC = () => {
    const comandos = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
    const nome = ['ping', 'comunismo', 'meme', 'joke', 'help', 'about', 'join', 'leave', 'play', 'stop', 'skip', 'repeat', 'nowPlaying', 'queue'];
    const funcao = ['Mostra o ping do bot para o servidor.', 'Glorifica o Comunismo para o servidor.', 'Envia um meme aleatório.', 'Envia uma piada aleatória.', 'Mostra uma lista com todos os comandos do bot.', 'Mostra as informações do Bot.', 'Faz o Bot entrar na call.', 'Faz o Bot sair da call.', 'Toca uma música', 'Para a música e limpa as filas.', 'Pula a música atual para a próxima da fila', 'Coloca a música atual em um loop', 'Mostra a música que está tocando', 'Mostra todas músicas da lista'];
    const sinonimo = ['Não possui', 'Não possui', 'Não possui', 'piada', 'comandos, ajuda', 'sobre, info', 'Não possui', 'exit, sair', 'Não possui', 'Não possui', 'Não possui', 'loop, repetir', 'tocando, current, atual', 'playlist, lista'];
    const exemplo = ['we!ping', 'we!comunismo', 'we!meme', 'we!joke', 'we!help', 'we!about', 'we!join', 'we!leave', 'we!play [youtube link]', 'we!stop', 'we!skip', 'we!repeat', 'we!nowPlaying', 'we!queue'];

    return (
        <main>
            {/*Wave*/}
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 210"><path fill="#FF1800" fill-opacity="1" d="M0,192L40,170.7C80,149,160,107,240,112C320,117,400,171,480,192C560,213,640,203,720,181.3C800,160,880,128,960,112C1040,96,1120,96,1200,112C1280,128,1360,160,1400,176L1440,192L1440,0L1400,0C1360,0,1280,0,1200,0C1120,0,1040,0,960,0C880,0,800,0,720,0C640,0,560,0,480,0C400,0,320,0,240,0C160,0,80,0,40,0L0,0Z"></path></svg>
            <Container>
                <Title>Comandos</Title>
                <Comandos>
                    {/*Adicionar um loop para cada Comando e fazer seus dados dinâmicos*/
                    }
                    {comandos.map((index: number) => {
                        return (
                            <Comando>
                                <Nome>{nome[index]}</Nome>
                                <Descricao><span>Função: </span>{funcao[index]}</Descricao>
                                <Sinonimos><span>Sinônimos: </span>{sinonimo[index]}</Sinonimos>
                                <Exemplo><span>Por exemplo: </span>{exemplo[index]}</Exemplo>
                            </Comando>);
                    })}   
                </Comandos>
            </Container>
        </main>
    );
};

export default Main;